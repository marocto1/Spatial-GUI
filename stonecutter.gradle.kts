plugins {
    id("dev.kikugie.stonecutter")
}

stonecutter active "26.1.2-fabric"

stonecutter parameters {
    constants.match(current.project.substringAfterLast('-'), "fabric", "neoforge", "forge")

    replacements {
        string(eval(current.version, "<26.2")) {
            replace("gameRenderer.mainCamera()", "gameRenderer.getMainCamera()")
            replace("= client.gui.screen()", "= client.screen")
        }

        string(eval(current.version, "<1.21.1")) {
            replace("modelView.pushMatrix()", "modelView.pushPose()")
            replace("modelView.popMatrix()", "modelView.popPose()")
        }

        string(eval(current.version, "<1.21.11")) {
            replace("camera.yRot()", "camera.getYRot()")
            replace("camera.xRot()", "camera.getXRot()")
            replace(".grabOrReleaseMouse(mc.getWindow(), ", ".grabOrReleaseMouse(mc.getWindow().getWindow(), ")
            replace("invertMouseY()", "invertYMouse()")
        }

        string(current.project.endsWith("-forge")) {
            replace("net.neoforged.neoforge.client.ClientHooks", "net.minecraftforge.client.ForgeHooksClient")
        }
    }
}
