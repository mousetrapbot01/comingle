CoMingle Apps
=============

Demo Android applications, orchestrated by CoMingle.

Lead Architect
  - Edmund S. L. Lam (sllam@qatar.cmu.edu)

Android Developers:
  - Ali Elgazar (aee@cmu.edu)

Alumni Developers:
  - Zeeshan Hanif 
  - Nabeeha Fatima

Basic Requirements
==================

To run this apps, you'll need the following:
  - At least one Android device running Android Lollipop
  - At least two Anroid device, each supporting Wifi-direct connections

I have tested these apps on 2 Nexus 4's running Android Lollipop, and 
2 Samsung Galaxy S4's running Android KitKat. Also, recently tested
with Sony Xperia Z2, Huawei Ascend Mate 7 and HTC One.

For now, the current network middleware supports Wifi-direct and LAN. 
Soon to come: Bluetooth and other sensors! (e.g., NFC, GPS, Gyroscope)

Using the Apps
==============

To use these apps, you can either setup the eclipse projects found here in the subfolders of this
repository, or install the precompiled development .apk files (in the precompiled_dev_apk) folder,
directly into your mobile. 

Once you have one of the apps installed in a few of your mobile devices, you must
establish a Wifi-direct group. To do this, use the Wifi-direct menu in your
'settings' and connect all your participating mobile devices to one, designated as 
the group owner.

** Note: Currently, the group owner must be running Android Lollipop, otherwise the
app's might not work well.. =( I'm not entirely sure why yet, but I'm working hard to
fix it!

Once you have established the Wifi-direct connection, you can run the app on each of
your devices, and start playing!

Apps on the List
================

This is the list of apps we have built with CoMingle so far. Please drop in from
time to time, we will be adding more examples!

- Drag Racing:
  A multi-player racing game, inspired by Chrome Racer (http://www.chrome.com/racer),
  lets you and your friends race across your mobile phones. 

- Battle Ship:
  An implementation of the traditional game that pits you and a friend in a guessing
  game of maritime warfare. Currently implementation supports only two players, but 
  we'll generalize it to beyond, as soon as we figure out creative ways of display
  more grids on tiny mobile phone displays. =P

- Wifi-Direct Directory
  This app demonstrates a simple routing service implemented in CoMingle that maintains
  on each mobile device, a dynamic IP routing table that allows each device of a 
  wifi-direct group to communicate with all other devices, via standard network sockets.
  All instances of the Comingle apps (include the other apps here) bootstraps an instance 
  of this service to maintain an active communication route to each device in the group.

- Musical Shares
  Bounce a sequence of musical notes between Android devices in an ensemble.
  Current version is only a demo: builds a linear chain ensemble and sends 5 notes
  across. We'll soon upgrade it and make it more fun!

- Mafia Party Game
  Basic version of the Mafia Game (https://en.wikipedia.org/wiki/Mafia_%28party_game%29).
  In this basic version, we only have Mafia's and Citizen, but the role of the moderator
  is taken over by the ensemble of mobile Android devices, each held by a player.
  day and night cycles are orchestrated by timed-synchronized vibrations across the
  mobile devices. A prototype version is available for download here, but we are working
  on refining and augmenting it. Stay tuned! 

Note
====

CoMingle is still work in progress, so please do forgive me for the lack of
documentations and the little bugs that you may experience will trying these apps.
I will be work my best to improve this prototype. Please email me at
sllam@qatar.cmu.edu if you wish to report a bug, or encounter any problems while
running the apps.

Also, my apologies if you find the apps stylistically unappealing.. =P they were
implemented and conceived by a CS major with a PhD, with no design training,
hardly any flare in fine arts, or even basic color sense.. =( If you feel you can 
help with ideas or contribute in the development of more CoMingle powered apps, please 
do contact me, I definitely could use the help! =)

Disclaimer
==========

These apps have been tested on 2 Nexus 4's running Android Lollipop, and 2 Samsung
Galaxy S4's running Android KitKat. While I'm pretty certain that they are harmless, 
neither are they intended to do any form of harm to yourself or your mobile device. 
However, I cannot be liable for any freak accidents that occur while you are running 
these apps. So please be cautious while using them. 

IMPORTANT!! Be careful about connecting more than six devices via wifi-direct.
Power consumption on the network owner device is insane! And device will SERIOUSLY
HEAT UP. Bewarned! And wear thick mittens!  

And don't use your mobile devices while driving or operating heavy machinery. 

