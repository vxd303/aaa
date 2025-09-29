# Keep the main activity so DexGuard does not strip it in the sample app.
-keep class com.example.dexguardsample.MainActivity {
    <init>;
    void onCreate(android.os.Bundle);
}
