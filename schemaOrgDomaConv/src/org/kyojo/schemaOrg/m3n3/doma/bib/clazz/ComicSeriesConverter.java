package org.kyojo.schemaOrg.m3n3.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.COMIC_SERIES;
import org.kyojo.schemaOrg.m3n3.bib.Clazz.ComicSeries;

@ExternalDomain
public class ComicSeriesConverter implements DomainConverter<ComicSeries, String> {

	@Override
	public String fromDomainToValue(ComicSeries domain) {
		return domain.getNativeValue();
	}

	@Override
	public ComicSeries fromValueToDomain(String value) {
		return new COMIC_SERIES(value);
	}

}
