#!/bin/sh
#
#  Start the Derby SQL Server in Network Mode
#
#  Spring-Moving
#  Brad Messerle
#  June 14th 2011

. ./config_env.sh
cd $SMDATABASE_HOME
$DERBY_INSTALL_PATH/startNetworkServer


 
