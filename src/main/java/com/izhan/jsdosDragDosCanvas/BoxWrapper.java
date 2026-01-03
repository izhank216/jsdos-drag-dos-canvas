package com.izhan.jsdosDragDosCanvas;

import org.teavm.jso.JSBody;

public class BoxWrapper {

    @JSBody(params = {"elementId"}, script = """
        (function(elementId){
            const el = document.getElementById(elementId);
            if (!el) return;
            el.style.position = 'absolute';
            el.style.border = '2px solid #00F';
        })($0);
    """)
    public static native void wrapBox(String elementId);
}
