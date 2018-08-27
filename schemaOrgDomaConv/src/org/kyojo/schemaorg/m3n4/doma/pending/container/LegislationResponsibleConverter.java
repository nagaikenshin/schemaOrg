package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_RESPONSIBLE;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationResponsible;

@ExternalDomain
public class LegislationResponsibleConverter implements DomainConverter<LegislationResponsible, String> {

	@Override
	public String fromDomainToValue(LegislationResponsible domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationResponsible fromValueToDomain(String value) {
		return new LEGISLATION_RESPONSIBLE(value);
	}

}
