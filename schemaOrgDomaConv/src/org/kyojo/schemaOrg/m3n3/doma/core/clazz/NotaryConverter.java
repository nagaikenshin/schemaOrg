package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NOTARY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Notary;

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
