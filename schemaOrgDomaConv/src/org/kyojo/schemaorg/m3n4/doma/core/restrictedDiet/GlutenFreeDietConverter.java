package org.kyojo.schemaorg.m3n4.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.restrictedDiet.GLUTEN_FREE_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.GlutenFreeDiet;

@ExternalDomain
public class GlutenFreeDietConverter implements DomainConverter<GlutenFreeDiet, String> {

	@Override
	public String fromDomainToValue(GlutenFreeDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public GlutenFreeDiet fromValueToDomain(String value) {
		return new GLUTEN_FREE_DIET(value);
	}

}
