# VPN Share - Android App

Mobile app for sharing IP addresses between devices using WebView + HTML UI.

## 🚀 Build APK with GitHub Actions

### Step 1: Create GitHub Repository

```bash
# Navigate to project
cd android-app

# Initialize git
git init
git add .
git commit -m "Initial commit: VPN Share Android App"
```

### Step 2: Create GitHub Repository

1. Go to https://github.com/new
2. Repository name: `vpn-share-android`
3. Make it Public or Private
4. Click "Create repository"

### Step 3: Push Code

```bash
# Add remote
git remote add origin https://github.com/YOUR_USERNAME/vpn-share-android.git

# Push code
git branch -M main
git push -u origin main
```

### Step 4: GitHub Builds APK Automatically!

1. Go to your repository on GitHub
2. Click "Actions" tab
3. See "Build Android APK" workflow running
4. Wait 3-5 minutes for build to complete

### Step 5: Download APK

1. Click on the completed workflow run
2. Scroll down to "Artifacts"
3. Download `vpn-share-debug-apk` (for testing)
4. Extract ZIP file
5. Get `app-debug.apk`

## 📱 Install APK on Phone

### Method 1: Direct Download
1. Upload APK to Google Drive/Dropbox
2. Open link on phone
3. Download APK
4. Enable "Install from Unknown Sources" in Settings
5. Install APK

### Method 2: USB Transfer
```bash
# Connect phone via USB
# Enable USB Debugging
adb install app-debug.apk
```

### Method 3: QR Code
1. Upload APK to file hosting
2. Generate QR code with link
3. Scan on phone
4. Download and install

## 🏗️ Project Structure

```
android-app/
├── app/
│   ├── src/main/
│   │   ├── assets/
│   │   │   └── index.html          # Your web UI
│   │   ├── java/com/vpnshare/
│   │   │   ├── MainActivity.kt     # WebView container
│   │   │   └── WebAppInterface.kt  # JS bridge
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
├── .github/workflows/
│   └── build.yml                    # Auto-build config
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 🔧 Local Development (Optional)

### Prerequisites
- Android Studio
- JDK 17+

### Build Locally
```bash
# Debug APK
./gradlew assembleDebug

# Release APK
./gradlew assembleRelease

# APK location:
# app/build/outputs/apk/debug/app-debug.apk
```

## 📦 Features

- ✅ WebView-based UI (uses your index.html)
- ✅ JavaScript bridge for native features
- ✅ Auto-build with GitHub Actions
- ✅ No local Android SDK needed
- ✅ Free and automated

## 🎯 JavaScript Bridge

Your HTML can call Android functions:

```javascript
// Show toast
Android.showToast('Hello from WebView!');

// Share text
Android.shareText('Check out VPN Share!');

// Get device info
const info = Android.getDeviceInfo();
console.log(info);
```

## 🐛 Troubleshooting

### Build Failed on GitHub
- Check Actions tab for error logs
- Ensure all files are committed
- Verify gradle files are correct

### APK Won't Install
- Enable "Install from Unknown Sources"
- Check Android version (requires 8.0+)
- Try uninstalling old version first

### WebView Not Loading
- Check index.html is in assets folder
- Verify JavaScript is enabled
- Check browser console for errors

## 📊 Build Status

Check build status: https://github.com/YOUR_USERNAME/vpn-share-android/actions

## 🎉 Success!

Once GitHub Actions completes:
1. ✅ APK is built automatically
2. ✅ Download from Artifacts
3. ✅ Install on phone
4. ✅ App works!

**No Android Studio needed!** 🚀
