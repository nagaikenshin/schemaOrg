package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ISWC_CODE;
import org.kyojo.schemaorg.m3n4.core.Container.IswcCode;

@ExternalDomain
public class IswcCodeConverter implements DomainConverter<IswcCode, String> {

	@Override
	public String fromDomainToValue(IswcCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public IswcCode fromValueToDomain(String value) {
		return new ISWC_CODE(value);
	}

}
