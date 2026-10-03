# Spatial GUI

> ## Minecraft 1.20.1 Forge Backport
>
> This fork includes an **unofficial backport of Spatial GUI 1.6 to Minecraft 1.20.1 Forge**.
>
> The goal is to bring Spatial GUI to the widely-used **Minecraft 1.20.1 + Forge 47.4.x + Java 17** stack while keeping the original immersive 3D inventory/container experience as close to upstream as possible.
>
> **Backport details**
> - Minecraft **1.20.1**
> - Forge **47.4.x**
> - Java **17**
> - Base version: **Spatial GUI 1.6**
> - Requires **Cloth Config 11.x for Forge**
> - **MixinExtras 0.5.5 is bundled** in the release JAR
> - Forge-specific screen hooks, events, keybind handling and rendering integration were added for 1.20.1
>
> **Download:** [Spatial GUI 1.6 — Forge 1.20.1 Backport](https://github.com/marocto1/Spatial-GUI/releases/tag/v1.6-forge-1.20.1)
>
> **Source branch:** [`forge-1.20.1`](https://github.com/marocto1/Spatial-GUI/tree/forge-1.20.1)
>
> This is **not an official upstream release**. Original project by [tastytrash](https://github.com/tastytrash/Spatial-GUI), licensed under MIT.
>
> **Socials:** Telegram — [@MaroctoDestiny](https://t.me/MaroctoDestiny)

---

**A client-side mod that renders inventory & container screens as a 3D plane, making the GUI more immersive.**
___
## Features

### First-person Mode
![First-person menu crafting GIF](https://cdn.modrinth.com/data/cached_images/961b53d75867806bf45fb6f7df0e5e34b242b322.gif)

*   The most immersive mode
*   Crosshair and mouse modes
*   Screen position, distance, scale, and rotation are all configurable
*   Parallax effect in mouse mode
*   Configurable screen opening animation
*   Visual only, with one exception: a setting keeps your rotation after you close the GUI, which turns your head
*   Curved screen option, especially good w/ mods that add large GUI extensions, such as JEI

### Third-person Mode
![third-person screenshot](https://cdn.modrinth.com/data/cached_images/74d080ca00474431a2d1fed3da972c82ef43b7c1.png)

*   The better choice for servers, since it's completely client-side
*   Switches to first-person automatically if the camera would clip through blocks
*   Camera and screen position, distance, scale, and rotation are all configurable
*   Parallax effect
*   Smooth camera transition and configurable screen opening animation

## Dependencies

Cloth Config
Fabric API & Mod Menu (Fabric only)

## Configuration

Access config via the keybind (default unbound), Mod Menu, or edit the config file.
It is highly recommended to check the config to tailor the mod to your liking, and there are tons of options.

## Fairness

This mod is mainly visual and tries not provide any gameplay advantages.

**Server Disclaimer:** Please check with server administrators before using it on multiplayer servers.

## Notes
*   Feel free to suggest features or report bugs on the GitHub
*   This mod is absolutely welcome to be used in modpacks, just be careful about it's compatilbility with certain mods

### Special thanks to:
Dizabanik for tons of code fixes and improvements  
vibing for the curved first-person screen feature  
BUILDLCS for the Brazilian Portuguese translation  
suheckii for the Russian translation  
22SSendo & jankeverse for particularly awesome feature suggestions  
Anyone else who reported bugs or suggested features :)