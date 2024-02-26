FROM ubuntu:latest
LABEL authors="chisk"


ENTRYPOINT ["top", "-b"]