package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.APPEARANCE;
import org.kyojo.schemaorg.m3n4.pending.Container.Appearance;

@ExternalDomain
public class AppearanceConverter implements DomainConverter<Appearance, String> {

	@Override
	public String fromDomainToValue(Appearance domain) {
		return domain.getNativeValue();
	}

	@Override
	public Appearance fromValueToDomain(String value) {
		return new APPEARANCE(value);
	}

}
