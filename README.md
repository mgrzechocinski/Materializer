Materializer
============

This app is made for open [Android Material Design workshop series](http://www.meetup.com/Mobile-Warsaw/events/218735999/) purpose.

Since there is limited time for whole workshop (around 3h per event), I'm not able to help everyone with every problem.
If you feel lost, don't worry. Ask me or your friend nearby for help. I'd try to help and she/he would do it for sure. 

If you feel totally lost, use one of the following checkpoints (git tags) to stay up to date with the rest of the attendees.
Tags are named by Android OS versions, so you should never confuse them with each other :) 
```
1. CUPCAKE             -    Checkpoint CUPCAKE - start version
2. DONUT               -    Checkpoint DONUT - Tabbed activity without swipes
3. ECLAIR              -    Checkpoint ECLAIR - Tabbed activity with swipes
4. FROYO               -    Checkpoint FROYO - fixed styles
5. GINGERBREAD         -    Checkpoint GINGERBREAD - introduce toolbar
6. HONEYCOMB           -    Checkpoint HONEYCOMB - Working tabs
7. ICS                 -    Checkpoint ICS - Tabs styles
8. JELLYBEAN           -    Checkpoint JELLYBEAN - Tabs finished
9. KITKAT              -    Checkpoint KITKAT - better menu drawer icon
10. LOLLIPOP           -    Checkpoint LOLLIPOP - final version :)
```

## FAQ ##
1. **What do I need to install/configure to pass gently?** 
  * Android Studio 0.9.x or IntelliJ IDEA with Android plugin supporting Android Gradle plugin v0.14 (Andorid Studio v0.9.x does)
  * SDK Platform & sources for both Kitkat & Lollipop
  * Emulators for 2.x, 4.x and 5.0 would intensify your impressions. If not, grab your phone at least.
  * Try to clone this project, import into your IDE, run and play with it

2. **I'm lost. How to catch up using of of the checkpoints using git?**
  * Soft mode (create branch on tag): `git checkout -b checkpoint/<TAG_NAME> <TAG_NAME>`
  * Hard mode (discard your changes): `git reset --hard <TAG_NAME>` 
