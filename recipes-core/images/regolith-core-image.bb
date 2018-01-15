LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "kernel-devicetree kernel"
IMAGE_INSTALL += "e2fsprogs e2fsprogs-resize2fs"
IMAGE_INSTALL += "i2c-tools"

IMAGE_FSTYPES = "ext4.gz tar.bz2"

SDKIMAGE_FEATURES = "dev-pkgs dbg-pkgs staticdev-pkgs"
