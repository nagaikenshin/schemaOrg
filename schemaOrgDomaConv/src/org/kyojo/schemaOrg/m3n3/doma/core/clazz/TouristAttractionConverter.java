package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TOURIST_ATTRACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TouristAttraction;

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
