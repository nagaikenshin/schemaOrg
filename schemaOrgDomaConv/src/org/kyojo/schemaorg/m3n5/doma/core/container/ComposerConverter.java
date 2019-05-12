package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COMPOSER;
import org.kyojo.schemaorg.m3n5.core.Container.Composer;

@ExternalDomain
public class ComposerConverter implements DomainConverter<Composer, String> {

	@Override
	public String fromDomainToValue(Composer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Composer fromValueToDomain(String value) {
		return new COMPOSER(value);
	}

}
