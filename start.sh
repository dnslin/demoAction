#!/bin/bash
docker pull dnslin/demoaction:latest
docker rm -f demoAction||true&&docker run --name=demoAction -d -p 6789:6789 dnslin/demoaction:latest
docker image prune -af