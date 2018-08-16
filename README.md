
## Donate
![Bitcoin](https://bitcoin.org/img/icons/logotop.svg)
![BitcoinQR](screenshots/3AcFNxGKLW357XKg9RJuBPSU3wjezi1HPh.png)

`3AcFNxGKLW357XKg9RJuBPSU3wjezi1HPh`

# MK VideoPlayer
MKVideoPlayer library is a video player have some basic features that need to develop an video player application in android studio
<!---MK video player--->
<!---MK video player--->
<!---MK video player--->
<!---MK video player--->
# features
1. base on [ijkplayer](https://github.com/Bilibili/ijkplayer).
2. gestures for volume control
3. gestures for brightness control
4. gestures for forward or backward
5. fullscreen by manual or sensor
6. lock screen feature
7. AspectRatio feature.
<!---MK video player--->
# How to add Library into Your project
<!---MK video player--->
The easiest way to get started using MKVideoPlayer(MK video player) is to add it as a gradle
dependency. You need to make sure you have the maven { url 'https://jitpack.io' } repositories
included in the `build.gradle` file in the root of your project:
<!---MK video player--->
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
<!---MK video player---><!---MK video player--->
Next add a gradle compile dependency to the `build.gradle` file of your app
module. The following will add a dependency to the full library:
<!---MK video player--->
```gradle
dependencies {
	         compile 'com.github.khizar1556.MKVideoPlayer:mkvideoplayer:0.1.5'
	}
```
# How to use 
## case 1: only want to play a video fullscreen
just call`MKPlayerActivity.configPlayer(activity).play(url)`.
<!---MK video player--->
## case 2: Add a MKplayer in layout
### step 1: include video layout in your layout xml file
``` xml

<include
        layout="@layout/mk_player"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />


```
### step 2: How to play a Video using MKPlayer
``` java

 MKPlayer mkplayer = new  MKPlayer(Activity);
mkplayer.play(url);
```
### step 3: How to handle setPlayerCallBacks
<!---MK video player--->
``` java
 player.setPlayerCallbacks(new MKPlayer.playerCallbacks() {
            @Override
            public void onNextClick() {
            //It is the method for next song.It is called when you pressed the next icon
            //Do according to your requirement
            }
            @Override
            public void onPreviousClick() {
            //It is the method for previous song.It is called when you pressed the previous icon
            //Do according to your requirement
            }
        });
```
<!---MK video player--->
# API:
* `play(url)` //play video
* `stop()`//stop video
* `pause()`//pause video
* `start()` //start  video
* `forward()` // forward or back video,example: forward(0.1f) forward(-0.1f)
* `getCurrentPosition()` 
* `setScaleType(MKPlayer.SCALETYPE_FITPARENT)` //set video scale type
* `toggleAspectRatio()` // toggle video scale type
* `seekTo(...)` //seek to specify position
* `getDuration()` //get video duration
* `onInfo(...)` //callback when have some information
* `onError(...)`  //callback when an error occurred
* `onComplete(...)` //callback when the play is over
* `onControlPanelVisibilityChange(...)` //callback when control panel visibility change
* `setPlayerCallbacks()` //Callback to control next and previous methods
<!---MK video player--->
# Screenshots:
<!---MK video player--->
![](https://raw.githubusercontent.com/khizar1556/MKVideoPlayer/master/screenshots/Screenshot_2017-10-06-18-27-04.png)
![](https://github.com/khizar1556/MKVideoPlayer/blob/master/screenshots/Screenshot_2017-10-06-18-28-12.png)
![](https://github.com/khizar1556/MKVideoPlayer/blob/master/screenshots/Screenshot_2017-10-06-18-32-34.png) 
<!---MK video player--->
