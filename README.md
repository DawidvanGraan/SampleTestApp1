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
Because RxAndroid releases are few and far between, it is recommended you also explicitly depend on RxJava's latest version for bug fixes and new features.

```gradle
compile "io.reactivex:rxandroid:$rxjava_version"
compile "io.reactivex:rxjava:$rxjava_version"
```

## RxBinding
```gradle
compile "com.jakewharton.rxbinding:rxbinding-design:$rxbinding_version"
compile "com.jakewharton.rxbinding:rxbinding:$rxbinding_version"
compile "com.jakewharton.rxbinding:rxbinding-support-v4:$rxbinding_version"
compile "com.jakewharton.rxbinding:rxbinding-appcompat-v7:$rxbinding_version"
compile "com.jakewharton.rxbinding:rxbinding-recyclerview-v7:$rxbinding_version"
```
## Butterknife
Repo: http://jakewharton.github.io/butterknife/
```gradle
compile 'com.jakewharton:butterknife:7.0.1'
```
## Dagger 2
```gradle
apt 'com.google.dagger:dagger-compiler:2.1'
compile 'com.google.dagger:dagger:2.1'
provided 'javax.annotation:jsr250-api:1.0'
```
## AutoValue
```gradle
compile "com.google.auto.value:auto-value:1.1"
compile 'javax.annotation:javax.annotation-api:1.2'
```
## LeakCanary
Repo: https://github.com/square/leakcanary

A memory leak detection library for Android and Java.

*“A small leak will sink a great ship.”* - Benjamin Franklin

```gradle
debugCompile 'com.squareup.leakcanary:leakcanary-android:1.4-beta2'
releaseCompile 'com.squareup.leakcanary:leakcanary-android-no-op:1.4-beta2'
testCompile 'com.squareup.leakcanary:leakcanary-android-no-op:1.4-beta2'
```
## Testing
```gradle
testCompile 'junit:junit:4.12'
testCompile "org.robolectric:robolectric:3.0"
testCompile 'com.squareup.assertj:assertj-android:1.1.1'
```