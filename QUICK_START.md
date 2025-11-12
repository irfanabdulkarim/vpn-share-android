# 🚀 Quick Start - Build APK with GitHub

## ✅ Project Ready!

Your Android app is ready to build. Just push to GitHub!

---

## 📋 3 Simple Steps:

### **Step 1: Create GitHub Repository**

1. Go to https://github.com/new
2. Repository name: `vpn-share-android`
3. Description: "VPN Share Android App"
4. Make it **Public** (required for free Actions)
5. Click **"Create repository"**

---

### **Step 2: Push Your Code**

```bash
# Navigate to project
cd android-app

# Add GitHub remote (replace YOUR_USERNAME)
git remote add origin https://github.com/YOUR_USERNAME/vpn-share-android.git

# Push code
git branch -M main
git push -u origin main
```

**That's it!** GitHub will automatically start building your APK.

---

### **Step 3: Download APK**

1. Go to your repository: `https://github.com/YOUR_USERNAME/vpn-share-android`
2. Click **"Actions"** tab at the top
3. Click on the running workflow (green dot = building, green checkmark = done)
4. Wait 3-5 minutes for build to complete
5. Scroll down to **"Artifacts"** section
6. Click **"vpn-share-debug-apk"** to download
7. Extract the ZIP file
8. You'll get **`app-debug.apk`**

---

## 📱 Install APK on Your Phone

### Option A: Google Drive
```
1. Upload app-debug.apk to Google Drive
2. Open Drive on your phone
3. Download the APK
4. Tap to install
5. Enable "Install from Unknown Sources" if prompted
```

### Option B: Direct Transfer
```
1. Connect phone to computer via USB
2. Copy app-debug.apk to phone's Download folder
3. Open Files app on phone
4. Tap app-debug.apk
5. Install
```

---

## 🎉 Done!

Your app is now installed and ready to use!

---

## 📊 Project Structure

```
android-app/
├── app/
│   ├── src/main/
│   │   ├── assets/
│   │   │   └── index.html          ← Your web UI
│   │   ├── java/com/vpnshare/
│   │   │   ├── MainActivity.kt     ← WebView
│   │   │   └── WebAppInterface.kt  ← JS bridge
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
├── .github/workflows/
│   └── build.yml                    ← Auto-build config
└── README.md
```

---

## 🔧 What Happens on GitHub?

When you push code, GitHub Actions automatically:
1. ✅ Sets up Android build environment
2. ✅ Installs Java 17
3. ✅ Runs Gradle build
4. ✅ Compiles your app
5. ✅ Generates APK
6. ✅ Uploads APK as artifact

**All for FREE!** 🎉

---

## 🐛 Troubleshooting

### "Build Failed"
- Check Actions tab for error logs
- Ensure repository is Public (for free Actions)
- Verify all files were pushed

### "Can't Install APK"
- Enable "Install from Unknown Sources" in Settings
- Check phone is Android 8.0+ (API 26+)
- Try uninstalling old version first

### "WebView Shows Blank"
- Check index.html is in assets folder
- Verify internet permission in manifest
- Check browser console for errors

---

## 📞 Need Help?

Check the full README.md for detailed instructions.

---

## 🎯 Summary

```bash
# 1. Create GitHub repo
# 2. Push code:
git remote add origin https://github.com/YOUR_USERNAME/vpn-share-android.git
git push -u origin main

# 3. Wait 5 minutes
# 4. Download APK from Actions → Artifacts
# 5. Install on phone
# 6. Done! 🎉
```

**Total time: 10 minutes** ⚡
