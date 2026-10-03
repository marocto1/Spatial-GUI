plugins {
    id("dev.kikugie.stonecutter")
}

stonecutter active "26.1.2-fabric"

stonecutter parameters {
    constants.match(current.project.substringAfterLast('-'), "fabric", "neoforge", "forge")

    replacements {
        string(eval(current.version, "<26.2")) {
            replace("gameRenderer.mainCamera()", "gameRenderer.getMainCamera()")
        }
        string(eval(current.version, "<26.2")) {
            replace("= client.gui.screen()", "= client.screen")
        }

        string(eval(current.version, "<1.21.1")) {
            replace("modelView.pushMatrix()", "modelView.pushPose()")
        }
        string(eval(current.version, "<1.21.1")) {
            replace("modelView.popMatrix()", "modelView.popPose()")
        }

        string(eval(current.version, "<1.21.11")) {
            replace("camera.yRot()", "camera.getYRot()")
        }
        string(eval(current.version, "<1.21.11")) {
            replace("camera.xRot()", "camera.getXRot()")
        }
        string(eval(current.version, "<1.21.11")) {
            replace(".grabOrReleaseMouse(mc.getWindow(), ", ".grabOrReleaseMouse(mc.getWindow().getWindow(), ")
        }
        string(eval(current.version, "<1.21.11")) {
            replace("invertMouseY()", "invertYMouse()")
        }

        // Forge 1.20.1 already captures/cancels screen rendering through
        // SpatialGUIRenderer's ScreenEvent.Render.Pre listener. The upstream
        // NeoForge GameRenderer redirect is therefore redundant on Forge and
        // can legitimately have zero matches after Forge/Connector transforms.
        // Keep the fallback method compiled, but don't make a missing internal
        // ForgeHooksClient call site a fatal mixin error.
        string(current.project.endsWith("-forge")) {
            replace(
                "@Redirect(method = \"render\", at = @At(\n            value = \"INVOKE\",\n            target = \"Lnet/neoforged/neoforge/client/ClientHooks;drawScreen(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/gui/GuiGraphics;IIF)V\"",
                "@Redirect(method = \"render\", require = 0, at = @At(\n            value = \"INVOKE\",\n            target = \"Lnet/minecraftforge/client/ForgeHooksClient;drawScreen(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/gui/GuiGraphics;IIF)V\""
            )
        }

        string(current.project.endsWith("-forge")) {
            replace("net.neoforged.neoforge.client.ClientHooks", "net.minecraftforge.client.ForgeHooksClient")
        }
    }
}
