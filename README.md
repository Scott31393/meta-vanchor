# meta-vanchor

This README file contains information on the contents of the
vanchor layer. It contains recipes to run https://github.com/Scott31393/Vanchor
on a OE target.

Please see the corresponding sections below for details.

# Quickstart

```sh

git clone https://git.yoctoproject.org/git/poky
cd poky
git clone https://github.com/openembedded/meta-openembedded.git
git clone https://github.com/Scott31393/meta-vanchor.git

. ./oe-init-build-env

bitbake-layers add-layer ../meta-openembedded/meta-oe
bitbake-layers add-layer ../meta-openembedded/meta-python
bitbake-layers add-layer ../meta-openembedded/meta-networking
bitbake-layers add-layer ../meta-vanchor

bitbake core-image-vanchor

cd /usr/bin/vanchor/src
python3 vanchor.py
```

You should now be able to access Vanchor via web browser usually under the address: http://10.0.0.100:8080

# Dependencies

```
URI: https://git.yoctoproject.org/git/poky
branch: nanbield
revision: HEAD

URI: https://github.com/openembedded/meta-openembedded.git
branch: nanbield
revision: HEAD

URI: https://git.yoctoproject.org/meta-raspberrypi
branch: nanbield
revision: HEAD
```

Why are these needed?

- [meta-oe](https://github.com/openembedded/meta-openembedded/tree/mickledore/meta-oe) : contains meta-python
- [meta-python](https://github.com/openembedded/meta-openembedded/tree/mickledore/meta-python) : contains many of the required python3 packages
- [meta-networking](https://github.com/openembedded/meta-openembedded/tree/mickledore/meta-networking) : contains several networking oriented python3 packages
- [meta-raspberrypi](https://github.com/agherzan/meta-raspberrypi) : contains several adafruit oriented python3 packages

# Contributing

Please submit any patches against the vanchor as Pull Requests on Github.

## Maintainers

* Tommaso Merciai <tomm.merciai@gmail.com>
