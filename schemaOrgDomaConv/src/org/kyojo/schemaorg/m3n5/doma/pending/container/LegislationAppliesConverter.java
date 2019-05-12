package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.LEGISLATION_APPLIES;
import org.kyojo.schemaorg.m3n5.pending.Container.LegislationApplies;

@ExternalDomain
public class LegislationAppliesConverter implements DomainConverter<LegislationApplies, String> {

	@Override
	public String fromDomainToValue(LegislationApplies domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationApplies fromValueToDomain(String value) {
		return new LEGISLATION_APPLIES(value);
	}

}
