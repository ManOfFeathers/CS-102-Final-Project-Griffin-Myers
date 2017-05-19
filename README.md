# CS-102-Final-Project-Griffin-Myers

This was my final project for a college-level programming class.

This project employs StdDraw.java program from the Princeton CS library (available at http://introcs.cs.princeton.edu/java/stdlib/StdDraw.java) to create illusions of 3-D images. It will change as I find ways to improve it.

The animation produced by ThingyTester.java begins with an animated cube. The coordinates of the cube's vertices are determined by a system of proportions that basically convert a 3-dimensional coordinate plane (x, y, z) to two dimensions (x, y). Animating this image, as well as adding pink grid lines, help drive home the 3-D illusion, as the focal point for seeing the images as a cube changes as the cube revolves. It's all in the viewer's head.

The image that appears after the cube spins around a few times follows similar rules, as each vertex has a sort of framework line connecting it to another vertex. However, the coordinates for this image are randomly generated, and rather than move in uniform as the cube's points did, the points here move independently and expand the object as they go. This results in vertices occasionally moving "toward" the viewer, in the z-direction, so when the image freezes and allows the viewing angle to change with mouse movements, it can appear as though the viewer is "inside" the shape.

Major help for this came from KobeJean. Seriously. I would never have finished this in time on my own.
