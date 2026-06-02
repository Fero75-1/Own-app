# CanliTV - Android TV App

A Netflix-style Android TV application with TiviMate-style zapping functionality built with Kotlin, Jetpack Compose, Media3/ExoPlayer, and Hilt.

## Architecture

- **MVVM**: Model-View-ViewModel pattern with Jetpack lifecycle
- **Clean Architecture**: Separation of concerns with Repository pattern
- **Dependency Injection**: Hilt for DI management
- **Navigation**: Jetpack Navigation Compose
- **Media Playback**: Media3 ExoPlayer for streaming

## Features

✅ Netflix-style Home Screen with categories and horizontal channel rows
✅ TiviMate-style Zapping Screen with vertical channel list and player
✅ D-pad navigation for TV remotes
✅ ExoPlayer integration with auto-play
✅ Retrofit API client for Cloudflare Worker backend
✅ Jetpack Compose for TV (androidx.tv:tv-foundation, tv-material)

## Project Structure

```
app/src/main/java/com/canlitv/app/
├── App.kt
├── MainActivity.kt
├── TvAppNavHost.kt
├── di/
│   └── NetworkModule.kt
├── data/
│   └── ChannelRepository.kt
├── network/
│   └── ApiService.kt
├── model/
│   ├── Channel.kt
│   └── Category.kt
├── ui/
│   ├── home/
│   │   ├── HomeScreen.kt
│   │   └── HomeViewModel.kt
│   ├── zapping/
│   │   ├── ZappingScreen.kt
│   │   └── ZappingViewModel.kt
│   ├── components/
│   │   └── ChannelCard.kt
│   └── theme/
│       └── Theme.kt
└── player/
    └── TvPlayer.kt
```

## Build & Run

```bash
./gradlew assembleDebug
./gradlew installDebug
```

## API Backend

**Base URL**: `https://cloudflare-api.fero131a.workers.dev/`

**Endpoints**:
- `GET /categories` - Fetch all categories with channels
- `GET /channels` - Fetch all channels

## Important

⚠️ All `streamUrl` fields are left **EMPTY** by default. Fill them with actual .m3u8 URLs as needed.
