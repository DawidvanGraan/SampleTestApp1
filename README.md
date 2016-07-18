# Sample Test App

Sample App used for Testing new Libraries and Features on Android

# Gradle File
Info on the gradle file structure

# Libraries Used
List of libraries used and why?

## Android Support Libraries

```gradle
compile "com.android.support:appcompat-v7:$android_support_lib_version"
compile "com.android.support:design:$android_support_lib_version"
compile "com.android.support:cardview-v7:$android_support_lib_version"
compile "com.android.support:gridlayout-v7:$android_support_lib_version"
compile "com.android.support:palette-v7:$android_support_lib_version"
compile "com.android.support:recyclerview-v7:$android_support_lib_version"
compile "com.android.support:percent:$android_support_lib_version"
compile "com.android.support:support-annotations:$android_support_lib_version"
```

## RxJava

RxJava – Reactive Extensions for the JVM – a library for composing asynchronous and event-based programs using observable sequences for the Java VM.

* [RxMarbles](http://rxmarbles.com/): Interactive diagrams of Rx Observables

```gradle
compile 'io.reactivex:rxandroid:1.1.0'
// Because RxAndroid releases are few and far between, it is recommended you also
// explicitly depend on RxJava's latest version for bug fixes and new features.
compile 'io.reactivex:rxjava:1.1.0'
```

https://github.com/ReactiveX/RxJava

https://github.com/ReactiveX/RxAndroid


## RxBinding
```gradle
compile "com.jakewharton.rxbinding:rxbinding-design:$rxbinding_version"
compile "com.jakewharton.rxbinding:rxbinding:$rxbinding_version"
compile "com.jakewharton.rxbinding:rxbinding-support-v4:$rxbinding_version"
compile "com.jakewharton.rxbinding:rxbinding-appcompat-v7:$rxbinding_version"
compile "com.jakewharton.rxbinding:rxbinding-recyclerview-v7:$rxbinding_version"
```
## Butter Knife

Field and method binding for Android views

```gradle
compile 'com.jakewharton:butterknife:7.0.1'
```
http://jakewharton.github.io/butterknife/

## Dagger 2
Dagger ‡ A fast dependency injector for Android and Java.

```gradle
apt 'com.google.dagger:dagger-compiler:2.1'
compile 'com.google.dagger:dagger:2.1'
provided 'javax.annotation:jsr250-api:1.0'
```
http://google.github.io/dagger/

## AutoValue
```gradle
compile "com.google.auto.value:auto-value:1.1"
compile 'javax.annotation:javax.annotation-api:1.2'
```
## LeakCanary

A memory leak detection library for Android and Java.

*“A small leak will sink a great ship.”* - Benjamin Franklin

```gradle
debugCompile 'com.squareup.leakcanary:leakcanary-android:1.4-beta2'
releaseCompile 'com.squareup.leakcanary:leakcanary-android-no-op:1.4-beta2'
testCompile 'com.squareup.leakcanary:leakcanary-android-no-op:1.4-beta2'
```
https://github.com/square/leakcanary

## Testing
```gradle
testCompile 'junit:junit:4.12'
testCompile "org.robolectric:robolectric:3.0"
testCompile 'com.squareup.assertj:assertj-android:1.1.1'
```

(https://jbt.github.io/markdown-editor)

http://dawidvangraan.github.io/SampleTestApp1/
