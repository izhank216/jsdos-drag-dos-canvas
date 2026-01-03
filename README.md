# jsdos-drag-dos-canvas
This plugin for JSDOS is used to make the DOS Canvas be draggable.

*This plugin isnt made by JSDOS, It is an PLUGIN for JSDOS.*

## Usage

Include `jsdos-drag-dos-canvas.js` after js-dos, create a DOS instance, and make the canvas draggable:

```html
<script src="jsdos.js"></script>
<script src="jsdos-drag-dos-canvas.js"></script>

<canvas id="dosCanvas" width="640" height="400"></canvas>

<script>
    Dos(document.getElementById('dosCanvas'), { wdosboxUrl: "wdosbox.js" })
        .ready().then(function(emulator) {
            DragDosCanvas.makeDosCanvasDraggable("dosCanvas");
        });
</script>
```
