# ECHO: Fast Concurrency Debugging with Parallel Differential Analysis

ECHO is a tool that interatively detects concurrency errors in multithreaded Java programs in the Eclipse IDE. For most code changes, it detects data races and deadlocks instantly, i.e., less than 100ms after the change is introduced. D4 is powered by a distributed system design and a set of parallel incremental algorithms for pointer analysis and happens-before analysis. We have also successfully integrated the pointer analysis code into the popular [WALA](https://github.com/april1989/Incremental_Points_to_Analysis.git) framework.

We provide an Eclipse plugin that implements the techniques in D4 and a video demo to introduce its features: 
[![here](https://img.youtube.com/vi/88W40z15kR4/hqdefault.jpg)](https://www.youtube.com/watch?v=88W40z15kR4)

If you use this resource, please cite our PLDI'18 paper: "D4: Fast Concurrency Debugging with Parallel Differential Analysis".

### Software Dependencies
- Java 1.8 to compile

### Build D4 in Eclipse

````git clone https://github.com/april1989/ECHO_Plugin.git```` (may take a couple of minutes depending on the network speed)

Next, import all the projects into Eclipse (all the required dependencies/libraries are included in the github), compile and build using Java 1.8. This project is an Eclipse plugin project, please install "Eclipse PDE". Goto Eclipse -> Help -> Eclipse Marketplace, search "Eclipse PDE" and install. 

### Running the Eclipse plugin of D4 
You can launch the plugin by following:  ````/edu.tamu.cse.aser.echo```` -> ````MANIFEST.MF```` -> Testing -> Launch an Eclipse application. 

As we introduced in the video demo, in the launched Eclipse workspace, you can create a new project or import your existing project. Right-click a main class select ASER -> ECHO to start the initial detection of the plugin. Please go to Window -> Show View -> Others to display our views (i.e., ECHO Concurrent Relations, ECHO Race List, ECHO Deadlock List) that report all the detected bugs. 

After some changes in your program to fix the bugs and save the program, the plugin will run in background to update the views.

If you do not want to analyze some variables or methods, right-click the variables/methods shown in the Outline view or the race list/concurrent relations, select D4 -> Ignore This Variable/Method. If you want to consider them later, right-click the variables/methods shown in the Outline view, select D4 -> Consider This Variable/Method.


### Authors
Bozhen Liu, Texas A&M University

Jeff Huang, Texas A&M University

### Paper
[PLDI'18] "[D4: Fast Concurrency Debugging with Parallel Differential Analysis](https://parasol.tamu.edu/~jeff/d4.pdf)"
