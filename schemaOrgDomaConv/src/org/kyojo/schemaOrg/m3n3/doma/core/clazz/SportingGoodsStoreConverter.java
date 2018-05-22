package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPORTING_GOODS_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SportingGoodsStore;

@ExternalDomain
public class SportingGoodsStoreConverter implements DomainConverter<SportingGoodsStore, String> {

	@Override
	public String fromDomainToValue(SportingGoodsStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public SportingGoodsStore fromValueToDomain(String value) {
		return new SPORTING_GOODS_STORE(value);
	}

}
