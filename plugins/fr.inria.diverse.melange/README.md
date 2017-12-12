# fr.inria.diverse.melange

## Technical details

### Antlr versions conflict

**Problem**

The eclipse plug-in dependency `de.ovgu.featureide.fm.core;bundle-version="3.4.1"` leads to the impossibility to generate the Xtext artifact because of a version conflict between xtext and featureide antlr version.

**Solution**

So far the solution is to remove `de.ovgu.featureide.fm.core;bundle-version` from the dependencies temporarily before starting xtext compilation.  