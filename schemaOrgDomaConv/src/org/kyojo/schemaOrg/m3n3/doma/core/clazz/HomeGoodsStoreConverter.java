package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOME_GOODS_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HomeGoodsStore;

@ExternalDomain
public class HomeGoodsStoreConverter implements DomainConverter<HomeGoodsStore, String> {

	@Override
	public String fromDomainToValue(HomeGoodsStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public HomeGoodsStore fromValueToDomain(String value) {
		return new HOME_GOODS_STORE(value);
	}

}
