# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9167f5e3f3c60eb2f0c457e6b991c725"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "git://github.com/ahmedramadan02/LAD_POSIX.git;protocol=https \
		file://init.service"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "934a5c93b68837f042916f5b6886aa2fbb425a9e"

S = "${WORKDIR}/git"

inherit cmake systemd

NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "init.service"

do_install(){
	install -d ${D}${bindir}
	install -m 0755 lad-posix ${D}${bindir}
	
	
    	install -d ${D}${systemd_unitdir}/system/
    	install -m 0644 ${WORKDIR}/init.service ${D}${systemd_unitdir}/system
}
