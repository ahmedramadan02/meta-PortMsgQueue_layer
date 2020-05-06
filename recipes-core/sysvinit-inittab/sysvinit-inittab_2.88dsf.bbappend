do_install_append(){
	# id:rstate:action:process
	# Using "respawn" will not allow SIGINT
	#echo "2:12345:respawn:/usr/bin/lad-posix" >> ${D}${sysconfdir}/inittab
	
	# Using we can use SIGINT with sysinit    
	echo "2::sysinit:/usr/bin/lad-posix" >> ${D}${sysconfdir}/inittab
}
