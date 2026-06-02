# Retrofit
-keep class retrofit2.** { *; }
-keepattributes Signature
-keepattributes Exceptions
-keepattributes *Annotation*

# Gson
-keep class com.google.gson.** { *; }
-keep class com.canlitv.app.model.** { *; }

# Hilt
-keep class * extends dagger.hilt.** { *; }
-keepclasseswithmembernames class * { @com.google.dagger.hilt.* <methods>; }
-keepclasseswithmembernames class * { @com.google.dagger.hilt.* <fields>; }

# Jetpack
-keep class androidx.** { *; }
-keep interface androidx.** { *; }

# ExoPlayer
-keep class com.google.android.exoplayer2.** { *; }
