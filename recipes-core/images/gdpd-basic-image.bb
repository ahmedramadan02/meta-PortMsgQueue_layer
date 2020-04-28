DESCRIPTION = "Basic image to load the LAD_POSIX app at init"
LICENSE = "MIT"

include recipes-core/images/core-image-minimal.bb

# IMAGE_FEATURES += "systemd"
IMAGE_INSTALL += "lad-posix"

write_init_link() {
	ln -sf /usr/bin/lad-posix ${IMAGE_ROOTFS}/sbin/init
}

ROOTFS_POSTPROCESS_COMMAND += "write_init_link;"
