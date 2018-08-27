package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TOURIST_ATTRACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.TouristAttraction;

@ExternalDomain
public class TouristAttractionConverter implements DomainConverter<TouristAttraction, String> {

	@Override
	public String fromDomainToValue(TouristAttraction domain) {
		return domain.getNativeValue();
	}

	@Override
	public TouristAttraction fromValueToDomain(String value) {
		return new TOURIST_ATTRACTION(value);
	}

}
