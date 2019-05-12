package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GEO_COVERED_BY;
import org.kyojo.schemaorg.m3n5.core.Container.GeoCoveredBy;

@ExternalDomain
public class GeoCoveredByConverter implements DomainConverter<GeoCoveredBy, String> {

	@Override
	public String fromDomainToValue(GeoCoveredBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoCoveredBy fromValueToDomain(String value) {
		return new GEO_COVERED_BY(value);
	}

}
