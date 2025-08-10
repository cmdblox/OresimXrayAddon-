# OresimXrayAddon (Meteor Addon) - for Minecraft 1.21.8

This repository contains a simple Meteor Client addon with three features:
- Xray/Oresim integration (module stub)
- `.seed <seed> <version>` command to set seed for Oresim calculations
- ChestAura module that auto-interacts with nearby chests

---

## What is included
- Kotlin sources in `src/main/kotlin/com/ori/oresimxrayaddon/`
- `build.gradle.kts` (example, may need version tweaks)
- GitHub Actions workflow to attempt automated build
- Instructions below for using GitHub and for local build

---

## Quick steps (upload to GitHub and use Actions)

1. Create a new **GitHub repository** (e.g. `OresimXrayAddon`) on your account.
2. Upload all files from this package (use _Add file → Upload files_ or push via Git) to the repository root.
3. Ensure branch `main` exists and the files are on `main`.
4. Go to **Actions** tab in the repo — you should see the workflow `Build Mod`. If not, create `./github/workflows/build.yml` from this package.
5. Trigger the workflow (it runs on push or you can click **Run workflow**).
6. When Actions completes, open the workflow run and download the artifact `mod-jar` (contains the built .jar in `build/libs/`).
7. Put the `.jar` into your Minecraft `mods/` folder alongside Meteor Client 1.21.8 and Fabric Loader for 1.21.8.

---

## Build locally (recommended for troubleshooting)

1. Install **Java 17+** (Temurin/AdoptOpenJDK).
2. Install **Gradle** or create Gradle wrapper locally:
   ```bash
   gradle wrapper
   ```
   or if you have gradle wrapper checked in, just run:
   ```bash
   ./gradlew build
   ```
3. The built jar will be in `build/libs/`.

---

## Notes & troubleshooting
- The `build.gradle.kts` contains placeholder versions (loom, meteor-client). If Actions fails, check logs and update the versions to the correct ones for Meteor Client 1.21.8.
- If Meteor Client artifact is not available on the Meteordev Maven, check Meteor Client's repo/releases and adjust `modImplementation` accordingly.
- If you prefer, you can add the Gradle wrapper into the repo (recommended) so Actions can run `./gradlew build` instead of relying on the Gradle GitHub Action.

If you want, I can also create the GitHub repo structure for you (you will need to commit/push or permit me to push).