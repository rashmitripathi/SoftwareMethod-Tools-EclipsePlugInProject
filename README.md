# SoftwareMethod-Tools-EclipsePlugInProject


As part of this project, existing source code has been converted to Eclipse plugins. This application is about Eclipse plug-ins, and the extension and extension point mechanism. Existing Java application source code is provided for Asteroids Game using Java Swing and AWT.
This is converted  to an Eclipse plug-in based application and can be run as eclipse plugin. 
application


Tools used: Eclipse PDE


The Plug-in Development Environment (PDE) provides tools to create, develop, test, debug, build and deploy Eclipse plug-ins, fragments, features, update sites and RCP products.

PDE also provides comprehensive OSGi tooling, which makes it an ideal environment for component programming, not just Eclipse plug-in development.

As part of this project, I have created four eclipse plugins:

## AsteroidViewPlugin : contains the starting point of the project. 
## AsteroidEnginePlugin : contains the Game and WordPanel project to start the Game screen and do drawing on it for spaceship,player etc and then render it.
## AsteroidUtilPlugin : contains the Clock and Vector to handle clocking mechansim and positioning for various objects on game screen.
## AsteroidEntityPlugin : contains the Asteroid, Bullet and Player graphics code like their draw method, collision actions etc.

I have created three extension points in AsteroidViewPlugin , AsteroidEnginePlugin.

For extension point , AsteroidViewPlugin StartGame , I have created extension GameScreen in AsteroidEnginePlugin.

For extension point, AsteroidEnginePlugin IClock and IVector, I have extensions Clock and Vector in AsteroidUtilPlugin.


## References:

Class tutorial by Dr. Yongie Zheng
