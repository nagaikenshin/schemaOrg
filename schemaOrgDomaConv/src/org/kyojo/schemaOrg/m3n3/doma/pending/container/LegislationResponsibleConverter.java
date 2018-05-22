package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_RESPONSIBLE;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationResponsible;

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
