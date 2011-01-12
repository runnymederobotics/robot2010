#Robot Requirements

##Autonomous mode
- hang the uber tubes on the top shelf
- precisely navigate and stop at the right place
- follow the tape lines to the racks
- what about Y’s?
- turn around face the other way
- head to other end zone (stop at middle)
- multiple autonomous modes (selectable via controller in debug mode)
- starting configuration -> need to be able to hold the uber tube
- can pre-charge pneumatics 
- gyros for navigation?
- outer racks do not have tape
##Teleoperated mode
###Mobility
- six wheel drive
- 2 speed transmissions
- pneumatic shifting for transmissions
- allocate time to optimize
- traction
- side slip
- wheel size
- PID loops
- use line following to line up to rack?
- high speed ~= 14 ft/s
###Tube gripper
- load from the feeding slot
- pick off the floor
- safe retraction position (for travelling with tube)
- hang a tube at any of the 6 heights
- pre-programmed positions -> hit button 1 for position 1 etc
- parallel push-button/joystick control of gripper (use last command)
- efficient tube release mechanism
- pneumatic gripper
- good air hose control, avoid entanglement
- don’t puncture tubes
- grip accuracy -> allow tolerance/sloppy driving
- single moving top ‘tong’ (see Tony/Kevin)
- display camera output for drivers? Is it legal?
###Gameplay
- colour coded signals to tell feeder what tube drivers want
- drive schemes
- tank drive?
- arcade drive?
- controller?
- standard joystick
- xbox?
- vibration feedback?
- do not cross into opponent’s zones, including gripper sticking out
- no point loss (minimize opponent’s seeding points)
- get to tower early
##Robot Failure
- fall back to manual control for gripper if encoders/other sensors busted
- kill switches where possible
- independent chains per wheel
##End game/minibot
- kick ass and win
- self-aligning a la 1114 in 2010
- hammer-strength bot?
- drive-up-the-pole?
- retain mini bot for duration of game
- how to make the mini bot go?
- limit switch activated by contact with pole?
- make use of first 5 seconds by moving up to the limit line?
- come back down on its own, without breaking
- very fast, lightweight
- needs enough force to activate switch at top
- deploy with initial upwards velocity
- deploy below minimum line
##Code
- source control (git?)
- comments!!!
- java
##General
- not hurt the robot
- don’t violate the 60 inch limits
- don’t cross foul lines
- good visibility at ~45 inch height
- relay image from robot camera? Only in debug mode?
- attention to pneumatic fitting to prevent/find leaks
- attention to electrical connections to prevent/find shorts/intermittent problems
- more practice
- practice with blocked vision
- fast, durable, repairable, diagnostics, fault tolerant
##TODO
- prototype the gripper, focusing on floor picking
- revive the 2008 robot with java
- get students out to meetings!!!
- strategy team to review this requirement document, come up with more ideas
- what would (did) 1114 do? 2056?