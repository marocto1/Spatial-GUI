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

        string(current.project.endsWith("-forge")) {
            replace("net.neoforged.neoforge.client.ClientHooks", "net.minecraftforge.client.ForgeHooksClient")
        }
    }
}
