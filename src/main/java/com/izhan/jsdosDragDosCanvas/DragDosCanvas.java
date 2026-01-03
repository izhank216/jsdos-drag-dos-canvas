package com.izhan.jsdosDragDosCanvas;

import org.teavm.jso.JSBody;

public class DragDosCanvas {

    @JSBody(params = {"canvasId"}, script = """
        (function(canvasId){
            const canvas = document.getElementById(canvasId);
            if (!canvas) { console.error("Canvas not found: " + canvasId); return; }
            
            let isDragging = false;
            let offsetX = 0, offsetY = 0;

            canvas.style.position = "absolute";
            canvas.style.cursor = "grab";

            canvas.addEventListener("mousedown", function(e) {
                isDragging = true;
                offsetX = e.clientX - canvas.offsetLeft;
                offsetY = e.clientY - canvas.offsetTop;
                canvas.style.cursor = "grabbing";
            });

            document.addEventListener("mouseup", function() {
                isDragging = false;
                canvas.style.cursor = "grab";
            });

            document.addEventListener("mousemove", function(e) {
                if (isDragging) {
                    canvas.style.left = (e.clientX - offsetX) + "px";
                    canvas.style.top = (e.clientY - offsetY) + "px";
                }
            });
        })($0);
    """)
    public static native void makeDosCanvasDraggable(String canvasId);
}
