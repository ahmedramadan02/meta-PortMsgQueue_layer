# This file is an extension of lad-posix_git recipe to apply any patches

FILESEXTRAPATHS_prepend := "${THISDIR}/files/patches:"
SRC_URI += "file://0001-bug-fixing-in-main.c-and-little-refactoring.patch"

