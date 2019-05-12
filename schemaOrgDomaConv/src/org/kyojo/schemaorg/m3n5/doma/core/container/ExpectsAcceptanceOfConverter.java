package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.EXPECTS_ACCEPTANCE_OF;
import org.kyojo.schemaorg.m3n5.core.Container.ExpectsAcceptanceOf;

@ExternalDomain
public class ExpectsAcceptanceOfConverter implements DomainConverter<ExpectsAcceptanceOf, String> {

	@Override
	public String fromDomainToValue(ExpectsAcceptanceOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExpectsAcceptanceOf fromValueToDomain(String value) {
		return new EXPECTS_ACCEPTANCE_OF(value);
	}

}
