package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.OCCUPATIONAL_CATEGORY;
import org.kyojo.schemaorg.m3n4.pending.Container.OccupationalCategory;

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
