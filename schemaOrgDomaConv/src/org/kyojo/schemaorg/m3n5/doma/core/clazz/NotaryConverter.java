package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NOTARY;
import org.kyojo.schemaorg.m3n5.core.Clazz.Notary;

@ExternalDomain
public class NotaryConverter implements DomainConverter<Notary, String> {

	@Override
	public String fromDomainToValue(Notary domain) {
		return domain.getNativeValue();
	}

	@Override
	public Notary fromValueToDomain(String value) {
		return new NOTARY(value);
	}

}
