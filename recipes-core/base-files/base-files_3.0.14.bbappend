do_install_append(){
	echo "/usr/bin/lad-posix" >> ${D}${sysconfdir}/profile
}
