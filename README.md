# OresimXrayAddon (Meteor Addon) - for Minecraft 1.21.8

This repository is a Meteor Client addon skeleton for Minecraft 1.21.8.
It contains three features (stubs/implementations):
- Xray (Oresim integration stub)
- .seed command to set seed for Oresim calculations
- Chest Aura module to interact with nearby chests automatically

**Usage:**
1. Upload this repo to GitHub (create repository and push).
2. Ensure branch `main` exists. GitHub Actions workflow will run on push and build the mod.
3. Download artifact from Actions -> build run -> Artifacts -> mod-jar.zip -> inside `build/libs/` contains the jar.

**Note:** Oresim integration requires Meteor Client internal APIs; the current Xray is a working module stub that listens for seed changes. You may need to adapt imports if Meteor's internal API names differ.

