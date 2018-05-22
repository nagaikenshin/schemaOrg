package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OCCUPATIONAL_CATEGORY;
import org.kyojo.schemaOrg.m3n3.core.Container.OccupationalCategory;

@ExternalDomain
public class OccupationalCategoryConverter implements DomainConverter<OccupationalCategory, String> {

	@Override
	public String fromDomainToValue(OccupationalCategory domain) {
		return domain.getNativeValue();
	}

	@Override
	public OccupationalCategory fromValueToDomain(String value) {
		return new OCCUPATIONAL_CATEGORY(value);
	}

}
