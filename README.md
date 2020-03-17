# ViewBinding
View Binding for Android (New Api)

## Why should we write viewBinding?
![1_lZsHEB7MOcgSd5dE64Nu8Q](https://user-images.githubusercontent.com/58409497/76833486-c6d8a700-686e-11ea-8e72-d85635eef8dc.png)
Source : https://medium.com/@devsumyat/view-binding-in-android-3-6-how-to-use-it-4e99921883d2

## Step 1. Build.gradle
```
android {
    ...
    /* You must install Android Studio 3.6 or higher.  */
    viewBinding {
        enabled = true
    }
    /* If you are Android Studio 4.0 or higher, write as follows. */
    /*
    buildFeatures {
        viewBinding = true
    }
    */
}
```
## Step 2. activity_main.xml
```
    ...
    <TextView
      android:id="@+id/tvTitle"
      .../>
    <TextView
      android:id="@+id/tvSubTitle"
      .../>
    ...
```

## Step 3. MainActivity.kt
```
/** Binding class name automatically generated for xml name */
import com.sample.myapplication.databinding.ActivityMainBinding //viewBinding

class MainActivity : AppCompatActivity() {
    //viewBinding
    private lateinit var viewBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //viewBinding init
        viewBinding = ActivityMainBinding.inflate(layoutInflater)

        //setContentView
        setContentView(viewBinding.root)

        //view Using
        viewBinding.tvTitle.text = "This is Title.."
        viewBinding.tvSubTitle.setText("This is subTitle..")
    }
}
```
