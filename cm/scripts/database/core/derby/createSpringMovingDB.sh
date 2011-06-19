#!/bin/sh
#
#  Create the Spring Moving DB
#
#  Spring-Moving
#  Brad Messerle
#  June 18th 2011

. ./config_env.sh
cd $SMDATABASE_HOME
$DERBY_INSTALL_PATH/ij $SCRIPTS_HOME/createSpringMovingDB.txt


 
