package com.example.face_test

import android.os.Bundle
import io.flutter.app.FlutterFragmentActivity
import io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin
import io.flutter.plugins.localauth.LocalAuthPlugin


class MainActivity : FlutterFragmentActivity() {
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FlutterAndroidLifecyclePlugin.registerWith(
            registrarFor(
                "io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin"
            )
        )
        LocalAuthPlugin.registerWith(registrarFor("io.flutter.plugins.localauth.LocalAuthPlugin"))
    }
}
