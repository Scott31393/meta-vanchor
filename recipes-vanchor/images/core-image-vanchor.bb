SUMMARY = "A small image just capable of running Vanchor"

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    vanchor \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

# 100 MiB of additional storage for config and runtime data
IMAGE_ROOTFS_EXTRA_SPACE = "102400"

inherit core-image
